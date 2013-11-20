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

package com.ootb.client.gin;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.client.gin.RestDispatchAsyncModule;
import com.gwtplatform.dispatch.client.rest.AbstractSerializerProvider;
import com.gwtplatform.dispatch.client.rest.RestApplicationPath;
import com.gwtplatform.dispatch.client.rest.SerializerProvider;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.ootb.client.application.ApplicationModule;
import com.ootb.client.box.request.BoxRequestFactory;
import com.ootb.client.place.NameTokens;
import com.ootb.client.place.PlaceManager;
import com.ootb.client.request.MyRequestFactory;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule(PlaceManager.class));
        install(new ApplicationModule());

        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.home);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.home);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.home);

        bind(MyRequestFactory.class).toProvider(RequestFactoryProvider.class).in(Singleton.class);
        bind(BoxRequestFactory.class).toProvider(BoxRequestFactoryProvider.class).in(Singleton.class);

        // Google Analytics
        // bindConstant().annotatedWith(GaAccount.class).to(ANALYTICS_ACCOUNT);
        bind(SerializerProvider.class).toProvider(SerializerProviderImple.class).in(Singleton.class);
        
        bindConstant().annotatedWith(RestApplicationPath.class).to("/rest");
        install(new RestDispatchAsyncModule.Builder().build());
    }

    static class SerializerProviderImple implements Provider<AbstractSerializerProvider> {

		@Override
		public AbstractSerializerProvider get() {
			return null;
		}
    	
    }
    
    static class RequestFactoryProvider implements Provider<MyRequestFactory> {
        private final MyRequestFactory requestFactory;

        @Inject
        public RequestFactoryProvider(EventBus eventBus) {
            requestFactory = GWT.create(MyRequestFactory.class);
            requestFactory.initialize(eventBus);
        }

        public MyRequestFactory get() {
            return requestFactory;
        }
    }

    static class BoxRequestFactoryProvider implements Provider<BoxRequestFactory> {
        private final BoxRequestFactory requestFactory;

        @Inject
        public BoxRequestFactoryProvider(EventBus eventBus) {
            requestFactory = GWT.create(BoxRequestFactory.class);
            requestFactory.initialize(eventBus);
        }

        public BoxRequestFactory get() {
            return requestFactory;
        }
    }

}
