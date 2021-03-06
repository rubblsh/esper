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

package com.espertech.esper.client.annotation;

public enum AppliesTo {
    UNDEFINED,
    UNIQUE,
    GROUPBY,
    INDEX,
    OUTPUTLIMIT,
    MATCHRECOGNIZE,
    CONTEXT,
    PRIOR,
    RANK,
    EVERYDISTINCT,
    SORTEDWIN,
    TIMEORDERWIN,
    KEEPALLWIN,
    PATTERN,
    TIMEACCUMWIN,
    TIMEBATCHWIN,
    TIMELENGTHBATCHWIN,
    GROUPWIN,
    LENGTHWIN,
    TIMEWIN,
    LENGTHBATCHWIN,
    PREV,
    EXPRESSIONWIN,
    EXPRESSIONBATCHWIN,
    FOLLOWEDBY,
    FIRSTLENGTHWIN,
    EXTTIMEDWIN,
    EXTTIMEDBATCHWIN
}
