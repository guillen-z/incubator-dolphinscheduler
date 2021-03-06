/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dolphinscheduler.alert.manager;

import org.apache.dolphinscheduler.alert.utils.MailUtils;

import java.util.List;
import java.util.Map;

/**
 * email send manager
 */
public class EmailManager {
    /**
     * email send
     * @param receiversList the receiver list
     * @param receiversCcList the cc List
     * @param title the title
     * @param content the content
     * @param showType the showType
     * @return the send result
     */
    public Map<String,Object> send(List<String> receiversList,List<String> receiversCcList,String title,String content,String showType){

        return MailUtils.sendMails(receiversList, receiversCcList, title, content, showType);
    }

    /**
     * msg send
     * @param receiversList the receiver list
     * @param title the title
     * @param content the content
     * @param showType the showType
     * @return the send result
     */
    public Map<String,Object> send(List<String> receiversList,String title,String content,String showType){

        return MailUtils.sendMails(receiversList,title, content, showType);
    }
    
}
