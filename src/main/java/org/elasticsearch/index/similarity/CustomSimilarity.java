package org.elasticsearch.index.similarity;

import org.apache.lucene.search.DefaultSimilarity;

/**
 * Custom similarity class
 * 
 * @author tanguy
 *
 */
@SuppressWarnings("serial")
public class CustomSimilarity extends DefaultSimilarity {

	@Override
	public float idf(int docFreq, int numDocs) {
		return 1.0f;
	}
}
