package com.howtographql.gregory;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import java.util.List;


public class Query implements GraphQLRootResolver {

	// create variable for LinkRepository 
    private final LinkRepository linkRepository;
    
    // initialize data
    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }
    
    // return all data
    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }
}