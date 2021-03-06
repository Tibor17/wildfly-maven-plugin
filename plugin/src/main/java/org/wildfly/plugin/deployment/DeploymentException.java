/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2016, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.wildfly.plugin.deployment;

import org.apache.maven.plugin.MojoExecutionException;

/**
 * Wrapped exception for {@link MojoExecutionException}.
 *
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
public class DeploymentException extends MojoExecutionException {
    public DeploymentException(final Object source, final String shortMessage, final String longMessage) {
        super(source, shortMessage, longMessage);
    }

    public DeploymentException(final String message, final Exception cause) {
        super(message, cause);
    }

    public DeploymentException(final Exception cause, final String format, final Object... args) {
        this(String.format(format, args), cause);
    }

    public DeploymentException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public DeploymentException(final Throwable cause, final String format, final Object... args) {
        this(String.format(format, args), cause);
    }

    public DeploymentException(final String message) {
        super(message);
    }

    public DeploymentException(final String format, final Object... args) {
        this(String.format(format, args));
    }
}
