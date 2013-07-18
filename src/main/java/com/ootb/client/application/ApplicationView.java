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

package com.ootb.client.application;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.ootb.client.place.NameTokens;

public class ApplicationView extends ViewWithUiHandlers<ApplicationUiHandlers> implements ApplicationPresenter.MyView {
    public interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    @UiField
    DockLayoutPanel main;

    @UiField
    HorizontalPanel blackTitle;
    
    @Inject
    public ApplicationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        main.getElement().getStyle().setBackgroundColor("#F0F0F0");
        blackTitle.getElement().getStyle().setBackgroundColor("#0F0F0F");
    }

    @Override
    public void setInSlot(Object slot, IsWidget content) {
        if (slot == ApplicationPresenter.TYPE_SetMainContent) {
        	main.clear();
            main.add(content);
        } else {
            super.setInSlot(slot, content);
        }
    }
    
    @UiField
    Button delivery;
    @UiHandler("delivery")
    void onSubmitClicked(ClickEvent event) {
    	getUiHandlers().Goto(NameTokens.deliveryInfo);
    }
    
    @UiField
    Button homeButton;
    @UiHandler("homeButton")
    void onHomeButtonClicked(ClickEvent event) {
    	getUiHandlers().Goto(null);
    }
    
}
