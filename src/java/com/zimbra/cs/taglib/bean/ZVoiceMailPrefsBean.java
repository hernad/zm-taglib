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

import com.zimbra.cs.zclient.ZVoiceMailPrefs;

import com.zimbra.common.soap.VoiceConstants;

public class ZVoiceMailPrefsBean extends ZCallFeatureBean {

    private boolean toBoolean(String v) {
	return (v != null && v.equalsIgnoreCase("true"));
    }

    public ZVoiceMailPrefsBean(ZVoiceMailPrefs feature) {
        super(feature);
    }

    public String getEmailNotificationAddress() {
        return getFeature().getEmailNotificationAddress();
    }

    public void setEmailNotificationAddress(String address) {
        getFeature().setEmailNotificationAddress(address);
    }

    public boolean getPlayDateAndTimeInMsgEnv() {
	return getFeature().getPlayDateAndTimeInMsgEnv();
    }
    
    public void setPlayDateAndTimeInMsgEnv(boolean value) {
	getFeature().setPlayDateAndTimeInMsgEnv(value);
    }
    
    public boolean getAutoPlayNewMsgs() {
	return getFeature().getAutoPlayNewMsgs();
    }
    
    public void setAutoPlayNewMsgs(boolean value) {
	getFeature().setAutoPlayNewMsgs(value);
    }
    
    public String getPromptLevel() {
	return getFeature().getPromptLevel();
    }
    
    public void setPromptLevel(String level) {
	getFeature().setPromptLevel(level);
    }
    
    public boolean getPlayCallerNameInMsgEnv() {
	return getFeature().getPlayCallerNameInMsgEnv();
    }
    
    public void setPlayCallerNameInMsgEnv(boolean value) {
	getFeature().setPlayCallerNameInMsgEnv(value);
    }
    
    public boolean getSkipPinEntry() {
	return getFeature().getSkipPinEntry();
    }
    
    public void setSkipPinEntry(boolean value) {
	getFeature().setSkipPinEntry(value);
    }
    
    public String getUserLocale() {
	return getFeature().getUserLocale();
    }

    public void setUserLocale(String locale) {
	getFeature().setUserLocale(locale);
    }

    public String getAnsweringLocale() {
	return getFeature().getAnsweringLocale();
    }

    public void setAnsweringLocale(String locale) {
	getFeature().setAnsweringLocale(locale);
    }

    
    protected ZVoiceMailPrefs getFeature() {
        return (ZVoiceMailPrefs) super.getFeature();
    }
}
