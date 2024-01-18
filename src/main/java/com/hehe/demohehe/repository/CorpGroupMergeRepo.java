package com.hehe.demohehe.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.spring.data.cosmos.repository.Query;
import com.hehe.demohehe.model.CorpGroupMerge;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CorpGroupMergeRepo extends CosmosRepository<CorpGroupMerge,String> {
//    @Query(value = "select cgm.id,cgm.name,cgm.corpCodes from corpGroupMerge cgm JOIN ")
//    List<CorpGroupMerge> findByPhrase(@Param("phrase")String phrase);
}
