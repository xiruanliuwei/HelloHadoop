package com.hellohadoop;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println( "Hello World!" );
        
        if(args.length != 2)
        {
        		System.err.println("Usage: App <input path> <output path>");
        		System.exit(-1);
        }
        
        Job job = new Job();
        // Set the Jar by finding where a given class came from.
        job.setJarByClass(App.class);
        job.setJobName("Max Temperature");
        
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        
        job.setMapperClass(MaxTemperatureMapper.class);
        job.setReducerClass(MaxTemperatureReducer.class);
        
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
