package com.hellohadoop;

import java.util.Map.Entry;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;

public class ConfigurationPrinter extends Configured implements Tool
{
	static
	{
		Configuration.addDefaultResource("core-default.xml");
		Configuration.addDefaultResource("core-site.xml");
		Configuration.addDefaultResource("hdfs-default.xml");
		Configuration.addDefaultResource("hdfs-site.xml");
		Configuration.addDefaultResource("yarn-default.xml");
		Configuration.addDefaultResource("yarn-site.xml");
		Configuration.addDefaultResource("mapred-default.xml");
		Configuration.addDefaultResource("mapred-site.xml");
	}
	
	@Override
	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Configuration conf = getConf();
		
		for(Entry<String, String> entry : conf)
		{
			System.out.printf("%s = %s\n", entry.getKey(), entry.getKey());
		}
		
		return 0;
	}
	
}