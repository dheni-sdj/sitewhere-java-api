/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.search.device;

import com.sitewhere.rest.model.search.SearchCriteria;
import com.sitewhere.spi.search.device.IDeviceTypeSearchCriteria;

/**
 * Default implementation of {@link IDeviceTypeSearchCriteria}.
 */
public class DeviceTypeSearchCriteria extends SearchCriteria implements IDeviceTypeSearchCriteria {

    /**
     * @param pageNumber
     * @param pageSize
     */
    public DeviceTypeSearchCriteria(int pageNumber, int pageSize) {
	super(pageNumber, pageSize);
    }

}
