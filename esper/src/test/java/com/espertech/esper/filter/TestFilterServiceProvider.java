/*
 * *************************************************************************************
 *  Copyright (C) 2006-2015 EsperTech, Inc. All rights reserved.                       *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.filter;

import com.espertech.esper.client.ConfigurationEngineDefaults;
import junit.framework.TestCase;

public class TestFilterServiceProvider extends TestCase
{
    public void testGetService()
    {
        FilterService serviceOne = FilterServiceProvider.newService(ConfigurationEngineDefaults.FilterServiceProfile.READMOSTLY, false);
        FilterService serviceTwo = FilterServiceProvider.newService(ConfigurationEngineDefaults.FilterServiceProfile.READMOSTLY, false);

        assertTrue(serviceOne != null);
        assertTrue(serviceOne != serviceTwo);
    }
}
