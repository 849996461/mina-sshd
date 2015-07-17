/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sshd.common.session;

import java.util.EventListener;

/**
 * Represents an interface receiving Session events.
 *
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public interface SessionListener extends EventListener {

    enum Event {
        KeyEstablished, Authenticated, KexCompleted
    }

    /**
     * A new session just been created
     *
     * @param session
     */
    void sessionCreated(Session session);

    /**
     * An event has been triggered
     *
     * @param session
     * @param event
     */
    void sessionEvent(Session session, Event event);

    /**
     * A session has been closed
     *
     * @param session
     */
    void sessionClosed(Session session);

}
