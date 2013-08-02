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
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.ootb.client.box.request.BoxEntityProxy;

public class DeliveryInfoPageView extends ViewWithUiHandlers<DeliveryInfoUiHandlers> implements DeliveryInfoPagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, DeliveryInfoPageView> {
    }
    
    @UiField(provided = true)
    CellTable<BoxEntityProxy> myTable;

    private final ListDataProvider<BoxEntityProxy> dataProvider;

    private final DateTimeFormat dateformat = DateTimeFormat.getFormat("yyyy-MM-dd HH:mm:ss");
    
    @Inject
    public DeliveryInfoPageView(final Binder uiBinder,
            final ListDataProvider<BoxEntityProxy> dataProvider) {
        this.dataProvider = dataProvider;
        this.myTable = new CellTable<BoxEntityProxy>();

        initCellTable();
        dataProvider.addDataDisplay(myTable);
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setData(List<BoxEntityProxy> data) {
    	if(data == null )
    		return;
        dataProvider.getList().clear();
        dataProvider.getList().addAll(data);
        dataProvider.refresh();
    }

    @UiHandler("prev")
    void onPrevClicked(ClickEvent event) {
    	getUiHandlers().goPrev();
    	getUiHandlers().refresh();
    }

    @UiHandler("next")
    void onNextClicked(ClickEvent event) {
    	getUiHandlers().goNext();
    	getUiHandlers().refresh();
    }

    @UiHandler("refresh")
    void onRefreshClicked(ClickEvent event) {
    	getUiHandlers().refresh();
    }

    @UiHandler("newer")
    void onNewerClicked(ClickEvent event) {
    	getUiHandlers().goLast();
    	getUiHandlers().refresh();
    }
    
    
    private void initCellTable() {
        TextColumn<BoxEntityProxy> id_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
            	if( object == null)
            		return " ";
                return object.getId().toString();
            }
        };
        myTable.addColumn(id_Column, "ID");

        TextColumn<BoxEntityProxy> device_id_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
                return object.getDeviceId().toString();
            }
        };
        myTable.addColumn(device_id_Column, "DeviceID");

        TextColumn<BoxEntityProxy> delivery_id_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
                return object.getDeliveryId().toString();
            }
        };
        myTable.addColumn(delivery_id_Column, "DeliveryID");
    
        TextColumn<BoxEntityProxy> sendMan_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
                return object.getSendMan().toString();
            }
        };
        myTable.addColumn(sendMan_Column, "Sender");

        TextColumn<BoxEntityProxy> sendCompany_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
                return object.getSendCompany().toString();
            }
        };
        myTable.addColumn(sendCompany_Column, "Sender Unit");
    
        
        TextColumn<BoxEntityProxy> sendTime_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
            	if( object == null || object.getSendTime() == null)
            		return "no date";
            	return dateformat.format(object.getSendTime());
            }
        };
        myTable.addColumn(sendTime_Column, "DateTime");

        
/*
         TextColumn<BoxEntityProxy> clientTel_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
                return object.getClientTel();
            }
        };
        myTable.addColumn(clientTel_Column, "clientTel");
*/
        
        TextColumn<BoxEntityProxy> ExpressStatus_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
            	if( object == null )
            		return "no data";
            	return object.getExpressStatus().toString();
            }
        };
        myTable.addColumn(ExpressStatus_Column, "ExpressStatus");
        
        
        TextColumn<BoxEntityProxy> notifyDate_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
            	if( object == null || object.getNotifyDate() == null)
            		return "no date";
            	return dateformat.format(object.getNotifyDate());
            }
        };
        myTable.addColumn(notifyDate_Column, "notifyDate");

        TextColumn<BoxEntityProxy> barCode_Column = new TextColumn<BoxEntityProxy>() {
            @Override
            public String getValue(BoxEntityProxy object) {
                return object.getBarCode();
            }
        };
        myTable.addColumn(barCode_Column, "barCode");
    
    }
}
