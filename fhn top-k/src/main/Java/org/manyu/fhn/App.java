package org.manyu.fhn;

import org.apache.commons.cli.*;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AlgoFHN obj =new AlgoFHN();
        CommandLine commandLine;
        Options options = new Options();
        CommandLineParser parser = new DefaultParser();
        options.addOption("i", true, "get input file");
        options.addOption("o", true, "get output file");
        options.addOption("tk", true, "get k");
        /*options.addOption("tm", true, "set transaction merging");
        options.addOption("c", true, "get transaction count");
        options.addOption("sup", true, "set subtree utility pruning");*/
        int tk=5;
        String inputPath="DB_NegativeUtility";
        String outputPath="Output.txt";
        //boolean activateTransactionMerging=true;
        //int maximumTransactionCount=8124;
        //boolean activateSubtreeUtilityPruning=true;
        try {
            commandLine=parser.parse(options,args);
            tk=Integer.parseInt(commandLine.getOptionValue("tk"));
            inputPath=commandLine.getOptionValue("i");
            outputPath=commandLine.getOptionValue("o");
            //maximumTransactionCount=Integer.parseInt(commandLine.getOptionValue("c"));
            //activateSubtreeUtilityPruning=Boolean.parseBoolean(commandLine.getOptionValue("sup"));
            //activateTransactionMerging=Boolean.parseBoolean(commandLine.getOptionValue("tm"));
            obj.runAlgorithm(inputPath,outputPath,tk);
            obj.printStats();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
