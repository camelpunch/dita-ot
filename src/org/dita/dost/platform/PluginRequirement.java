/*
 * This file is part of the DITA Open Toolkit project hosted on
 * Sourceforge.net. See the accompanying license.txt file for 
 * applicable licenses.
 */

/*
 * (c) Copyright IBM Corp. 2005, 2008 All Rights Reserved.
 */

package org.dita.dost.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
/**
 * PluginRequirement class.
 *
 */
public class PluginRequirement {
	private static final String REQUIREMENT_SEPARATOR = "|";
	private final ArrayList<String> plugins;
	private boolean required;
	/**
	 * Constructor.
	 */
	public PluginRequirement() {
		plugins = new ArrayList<String>();
		required = true;
	}
	/**
	 * Add plugins.
	 * @param s plugins name
	 */
	public void addPlugins(final String s) {
		final StringTokenizer t = new StringTokenizer(s, REQUIREMENT_SEPARATOR);
		while (t.hasMoreTokens()) {
			plugins.add(t.nextToken());
		}
	}
	/**
	 * Set require.
	 * @param r require
	 */
	public void setRequired(final boolean r) {
		required = r;
	}
	/**
	 * Get plugins.
	 * @return plugins
	 */
	public Iterator<String> getPlugins() {
		return plugins.iterator();
	}
	/**
	 * See whether this plugin is required.
	 * @return required
	 */
	public boolean getRequired() {
		return required;
	}
	/**
	 * To String.
	 * @return string
	 */
	@Override
	public String toString() {
		return plugins.toString();
	}
}