package org.elasticsearch.index.similarity;

import org.apache.lucene.search.similarities.DefaultSimilarity;

/**
 * Custom similarity class
 * 
 * @author tanguy
 *
 */
@SuppressWarnings("serial")
public class CustomSimilarity extends DefaultSimilarity {

	@Override
	public float idf(long docFreq, long numDocs) {
		return 1.0f;
	}
}
