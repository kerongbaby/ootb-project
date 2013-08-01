package com.ootb.mybatis;

import java.util.Properties;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.mapping.MappedStatement.Builder;  

//@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
@Intercepts({@Signature(type=Executor.class,method="query",
	args={ MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class })})  
public class InterceptsPlugins implements Interceptor {
	
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		MappedStatement mappedStatement=(MappedStatement)invocation.getArgs()[0];         
        Object parameter = invocation.getArgs()[1];
        BoundSql boundSql = mappedStatement.getBoundSql(parameter);   
        String originalSql = boundSql.getSql().trim();

		System.out.println(originalSql);
        
        RowBounds rowBounds = (RowBounds)invocation.getArgs()[2];  
		
		if( rowBounds != null )
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+rowBounds.getLimit());
		
        String pagesql=originalSql + " limit "+ rowBounds.getLimit() + " offset " + rowBounds.getOffset();
		System.out.println(pagesql);
        
        invocation.getArgs()[2] = new RowBounds(RowBounds.NO_ROW_OFFSET, RowBounds.NO_ROW_LIMIT);     
        BoundSql newBoundSql = new BoundSql(mappedStatement.getConfiguration(), pagesql,boundSql.getParameterMappings(),boundSql.getParameterObject());     
        MappedStatement newMs = copyFromMappedStatement(mappedStatement,new BoundSqlSqlSource(newBoundSql));    
         
        invocation.getArgs()[0]= newMs;    		
	
		return invocation.proceed();
	
	}

	public static class BoundSqlSqlSource implements SqlSource {    
        BoundSql boundSql;    
    
        public BoundSqlSqlSource(BoundSql boundSql) {    
            this.boundSql = boundSql;    
        }    
    
        public BoundSql getBoundSql(Object parameterObject) {    
            return boundSql;    
        }    
    }    	
	
	private MappedStatement copyFromMappedStatement(MappedStatement ms,     
            SqlSource newSqlSource) {     
           Builder builder = new MappedStatement.Builder(ms.getConfiguration(),     
           ms.getId(), newSqlSource, ms.getSqlCommandType());     
           builder.resource(ms.getResource());     
           builder.fetchSize(ms.getFetchSize());     
           builder.statementType(ms.getStatementType());     
           builder.keyGenerator(ms.getKeyGenerator());
           // TODO:
           // builder.keyProperty(ms.getKeyProperty());     
           builder.timeout(ms.getTimeout());     
            builder.parameterMap(ms.getParameterMap());     
           builder.resultMaps(ms.getResultMaps());     
           builder.cache(ms.getCache());     
           MappedStatement newMs = builder.build();     
           return newMs;     
           }     	
	
	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		System.out.println("intercept 3");
	}

}
