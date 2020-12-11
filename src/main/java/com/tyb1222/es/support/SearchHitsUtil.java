package com.tyb1222.es.support;

import org.elasticsearch.search.SearchHits;

/**
 * Utility class to prevent leaking of Lucene API into Spring Data Elasticsearch.
 *
 * @author Peter-Josef Meisch
 * @since 4.0
 */
public final class SearchHitsUtil {
    private SearchHitsUtil() {}

    public static long getTotalCount(SearchHits searchHits) {
        return searchHits.getTotalHits().value;
    }
}
