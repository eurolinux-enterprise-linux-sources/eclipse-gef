/*******************************************************************************
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.gef.examples.text.model.commands;

import org.eclipse.gef.examples.text.model.ModelLocation;
import org.eclipse.gef.examples.text.model.TextRun;


public class RemoveText extends MiniEdit {

int offset;

char chars[];

private final TextRun run;

public RemoveText(TextRun run, int begin, int end) {
	this.run = run;
	this.offset = begin;
	this.chars = run.getText().substring(offset, end).toCharArray();
}

public void apply() {
	run.removeRange(offset, chars.length);
}

public boolean canApply() {
	return chars != null && chars.length != 0;
}

public ModelLocation getResultingLocation() {
	return new ModelLocation(run, offset);
}

public void reapply() {
	apply();
}

public void rollback() {
	run.insertText(new String(chars), offset);
}

}
