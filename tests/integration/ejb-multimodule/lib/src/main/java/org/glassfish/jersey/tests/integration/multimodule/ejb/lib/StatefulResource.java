/*
 * Copyright (c) 2014, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.jersey.tests.integration.multimodule.ejb.lib;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * JAX-RS resource backed with a stateful EJB bean.
 *
 * @author Jakub Podlesak (jakub.podlesak at oracle.com)
 */
@Stateful
@Path("stateful")
public class StatefulResource {

    @EJB EjbCounterResource counter;

    @GET
    @Path("count")
    public int getCount() {
        return counter.getCount();
    }
}