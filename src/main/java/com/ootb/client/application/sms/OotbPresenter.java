/**
 * Copyright 2012 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ootb.client.application.sms;

import java.util.List;

import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.Resource;
import org.fusesource.restygwt.client.RestServiceProxy;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.ootb.client.application.ApplicationPresenter;
import com.ootb.client.box.request.BoxEntityProxy;
import com.ootb.client.place.NameTokens;

public class OotbPresenter extends Presenter<OotbPresenter.MyView, OotbPresenter.MyProxy>
	implements OotbUiHandlers {
    public interface MyView extends View, HasUiHandlers<OotbUiHandlers>{
        void setData(List<BoxEntityProxy> data);
    }

    @ProxyStandard
    @NameToken(NameTokens.sms)
    public interface MyProxy extends ProxyPlace<OotbPresenter> {
    }


    @Inject
    public OotbPresenter(final EventBus eventBus, final MyView view, final MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetMainContent);
        view.setUiHandlers(this);
    }

    @Override
    protected void onReveal() {
        loadEntities();
    }

    private void loadEntities() {
    	SmsService service = GWT.create(SmsService.class);
//    	Resource resource = new Resource( GWT.getModuleBaseURL() );
    	Resource resource = new Resource( GWT.getHostPageBaseURL());
    	((RestServiceProxy)service).setResource(resource);
    	
    	service.getSMS(limit, offset, new MethodCallback<String>(){

			@Override
			public void onFailure(Method method, Throwable exception) {
				System.out.println("Failed");
				
			}

			@Override
			public void onSuccess(Method method, String response) {
				System.out.println("Yes");
				
			}});
    }

    private int offset = 0;
    private final int limit = 14;
	@Override
	public void goPrev() {
		System.out.println("go");
		offset -= limit;
		if(offset < 0 )
			offset = 0;
	}

	@Override
	public void goNext() {
		offset += limit;
	}

	@Override
	public void goLast() {
		offset = 0;
	}
	
	@Override
	public void refresh() {
		loadEntities();
	}
}
