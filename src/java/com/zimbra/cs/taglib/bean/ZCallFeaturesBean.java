/*
 * ***** BEGIN LICENSE BLOCK *****
 * 
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2007 Zimbra, Inc.
 * 
 * The contents of this file are subject to the Yahoo! Public License
 * Version 1.0 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * 
 * ***** END LICENSE BLOCK *****
 */

package com.zimbra.cs.taglib.bean;

import com.zimbra.common.service.ServiceException;
import com.zimbra.common.soap.VoiceConstants;
import com.zimbra.cs.zclient.ZCallFeatures;

public class ZCallFeaturesBean {

    private ZCallFeatures mFeatures;

    public ZCallFeaturesBean(ZCallFeatures features, boolean modify) {
        mFeatures = features;
    }

    public ZCallFeatures getCallFeatures() {
        return mFeatures;
    }

    public ZVoiceMailPrefsBean getVoiceMailPrefs() {
        return new ZVoiceMailPrefsBean(mFeatures.getVoiceMailPrefs());
    }

    public ZCallForwardingBean getCallForwardingAll() throws ServiceException {
        return new ZCallForwardingBean(mFeatures.getFeature(VoiceConstants.E_CALL_FORWARD));
    }

    public ZSelectiveCallForwardingBean getSelectiveCallForwarding() throws ServiceException {
        return new ZSelectiveCallForwardingBean(mFeatures.getSelectiveCallForwarding());
    }

    public boolean isEmpty() { return mFeatures.isEmpty(); }
}
