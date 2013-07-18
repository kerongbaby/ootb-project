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

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.ootb.client.request.proxy.MyEntityProxy;

public class DeliveryInfoPageView extends ViewImpl implements DeliveryInfoPagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, DeliveryInfoPageView> {
    }

    @UiField(provided = true)
    CellTable<MyEntityProxy> myTable;

    private final ListDataProvider<MyEntityProxy> dataProvider;

    @Inject
    public DeliveryInfoPageView(final Binder uiBinder,
            final ListDataProvider<MyEntityProxy> dataProvider) {
        this.dataProvider = dataProvider;
        this.myTable = new CellTable<MyEntityProxy>();

        initCellTable();
        dataProvider.addDataDisplay(myTable);
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setData(List<MyEntityProxy> data) {
        dataProvider.getList().clear();
        dataProvider.getList().addAll(data);
        dataProvider.refresh();
    }

    @UiHandler("submit")
    void onSubmitClicked(ClickEvent event) {
    }

    private void initCellTable() {
        TextColumn<MyEntityProxy> firstNameColumn = new TextColumn<MyEntityProxy>() {
            @Override
            public String getValue(MyEntityProxy object) {
                return object.getFirstName();
            }
        };
        myTable.addColumn(firstNameColumn, "First name");

        TextColumn<MyEntityProxy> lastNameColumn = new TextColumn<MyEntityProxy>() {
            @Override
            public String getValue(MyEntityProxy object) {
                return object.getLastName();
            }
        };
        myTable.addColumn(lastNameColumn, "Last name");
    }
}
