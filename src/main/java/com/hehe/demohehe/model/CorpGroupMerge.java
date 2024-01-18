package com.hehe.demohehe.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

import java.util.List;

@Container(containerName = "corpGroupMerge")
public class CorpGroupMerge {
    @Id
    private String id;
    @PartitionKey
    private String name;
    private String status;
    private List<CorpCodeinMerge> corpCodes;
}
