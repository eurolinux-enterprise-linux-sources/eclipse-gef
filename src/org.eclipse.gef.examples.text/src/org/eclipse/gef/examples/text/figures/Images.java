/*******************************************************************************
 * Copyright (c) 2004, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.gef.examples.text.figures;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.swt.graphics.Image;

/**
 * @since 3.1
 */
public class Images {

	public static final Image IMPORTS = createImage("imports.gif");
	public static final Image IMPORT = createImage("importstatement.gif");
	public static final Image PUBLIC = createImage("public.gif");
	public static final Image PRIVATE = createImage("private.gif");
	public static final Image PROTECTED = createImage("protected.gif");

	private static Image createImage(String name) {
		InputStream stream = Images.class.getResourceAsStream(name);
		Image image = new Image(null, stream);
		try {
			stream.close();
		} catch (IOException exc) {
		}
		return image;
	}

}
