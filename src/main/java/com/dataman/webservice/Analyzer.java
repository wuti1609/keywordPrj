package com.dataman.webservice;


import com.dataman.nlp.util.StanfordSegment;

import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;

public class Analyzer {
    public static CRFClassifier<CoreLabel> analyzer;
    
    static {
        Analyzer.analyzer = StanfordSegment.wordSegment("http://10.3.12.2:8666/analyzer");
    }
}
