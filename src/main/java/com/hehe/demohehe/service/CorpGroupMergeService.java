package com.hehe.demohehe.service;

import com.hehe.demohehe.model.CorpCodeinMerge;
import com.hehe.demohehe.model.CorpGroupMerge;

import java.util.List;

public interface CorpGroupMergeService {
    List<CorpGroupMerge> getAllCorpGroup();
    CorpGroupMerge getCorpGroupByID(String id);
    List<CorpGroupMerge> getCorpGroupBySearchPhrase(String phrase);

    List<CorpCodeinMerge> getCorpCodeByCorpGroupID();
    List<CorpCodeinMerge> getCorpCodeByCorpGroup(String phrase);

    CorpGroupMerge insertCorpGroup(CorpGroupMerge corpGroup);
    CorpGroupMerge updateCorpGroup(CorpGroupMerge corpGroup);
    CorpGroupMerge deleteCorpGroupByID(CorpGroupMerge corpGroup);
    CorpGroupMerge deleteCorpGroupByName(CorpGroupMerge corpGroup);
}
