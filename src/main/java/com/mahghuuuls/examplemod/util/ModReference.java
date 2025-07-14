package com.mahghuuuls.examplemod.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModReference {
	public static final String MOD_ID = "exampleid";
	public static final String NAME = "Example Name";
	public static final String VERSION = "1.0.0";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// Assumes the base package is equal to the MOD_ID
	public static final String BASE_PACKAGE = "com.mahghuuuls." + MOD_ID;

	public static final String CLIENT_PROXY_CLASS = BASE_PACKAGE + ".proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = BASE_PACKAGE + ".proxy.CommonProxy";
}