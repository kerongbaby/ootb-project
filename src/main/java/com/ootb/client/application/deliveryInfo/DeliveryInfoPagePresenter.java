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

package com.ootb.client.application.deliveryInfo;

import java.util.List;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.ootb.client.application.ApplicationPresenter;
import com.ootb.client.place.NameTokens;
import com.ootb.client.request.MyRequestFactory;
import com.ootb.client.request.MyServiceRequest;
import com.ootb.client.request.proxy.MyEntityProxy;

public class DeliveryInfoPagePresenter extends Presenter<DeliveryInfoPagePresenter.MyView, DeliveryInfoPagePresenter.MyProxy> {
    public interface MyView extends View {
        void setData(List<MyEntityProxy> data);
    }

    @ProxyStandard
    @NameToken(NameTokens.deliveryInfo)
    public interface MyProxy extends ProxyPlace<DeliveryInfoPagePresenter> {
    }

    private final MyRequestFactory requestFactory;

    private MyServiceRequest currentContext;
    private String searchToken;

    @Inject
    public DeliveryInfoPagePresenter(final EventBus eventBus, final MyView view, final MyProxy proxy,
            final MyRequestFactory requestFactory) {
        super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetMainContent);
//        super(eventBus, view, proxy);
        this.requestFactory = requestFactory;
    }

    @Override
    protected void onReveal() {
        searchToken = "";
        initializeContext();
        loadEntities();
    }

    private void initializeContext() {
        currentContext = requestFactory.myService();
    }

    private void loadEntities() {
        requestFactory.myService().loadAll(searchToken).fire(new Receiver<List<MyEntityProxy>>() {
            @Override
            public void onSuccess(List<MyEntityProxy> data) {
                getView().setData(data);
            }
        });
    }
}
