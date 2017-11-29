package com.hellohadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.ToolRunner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println( "Hello World!" );
        
        Configuration config = new Configuration();
        // config.addResource(...);
        // config.addResource("core-default.xml");  xxx
        Configuration.addDefaultResource("core-default.xml");
        
        ToolRunner.run(new ConfigurationPrinter(), args);
        
        if(args.length != 2)
        {
        		System.err.println("Usage: App <input path> <output path>");
        		System.exit(-1);
        }
        
        Job job = Job.getInstance();
        job.setJarByClass(App.class);
        job.setJobName("Max Temperature");
        
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        
        job.setMapperClass(MaxTemperatureMapper.class);
        job.setReducerClass(MaxTemperatureReducer.class);
        
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        
        // System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
