package com.hehe.demohehe.service.Impl;

import com.hehe.demohehe.model.CorpCodeinMerge;
import com.hehe.demohehe.model.CorpGroupMerge;
import com.hehe.demohehe.repository.CorpGroupMergeRepo;
import com.hehe.demohehe.service.CorpGroupMergeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
public class CorpGroupMergeServiceImpl implements CorpGroupMergeService {

    @Autowired
    private CorpGroupMergeRepo repo;

    @Override
    public List<CorpGroupMerge> getAllCorpGroup() {
        Iterable<CorpGroupMerge> result = repo.findAll();
        ArrayList<CorpGroupMerge> corpGroups = new ArrayList<>();
        result.forEach(corpGroups::add);
        return corpGroups;
    }

    @Override
    public CorpGroupMerge getCorpGroupByID(String id) {
        CorpGroupMerge result = null;
        try {
            result = repo.findById(id).get();
        } catch (NoSuchElementException e){
            log.error("Corporate group id: {} not found",id);
        }
        return result;
    }

    @Override
    public List<CorpGroupMerge> getCorpGroupBySearchPhrase(String phrase) {
        return null;
    }

    @Override
    public List<CorpCodeinMerge> getCorpCodeByCorpGroupID() {
        return null;
    }

    @Override
    public List<CorpCodeinMerge> getCorpCodeByCorpGroup(String phrase) {
        return null;
    }

    @Override
    public CorpGroupMerge insertCorpGroup(CorpGroupMerge corpGroup) {
        return null;
    }

    @Override
    public CorpGroupMerge updateCorpGroup(CorpGroupMerge corpGroup) {
        return null;
    }

    @Override
    public CorpGroupMerge deleteCorpGroupByID(CorpGroupMerge corpGroup) {
        return null;
    }

    @Override
    public CorpGroupMerge deleteCorpGroupByName(CorpGroupMerge corpGroup) {
        return null;
    }

}
