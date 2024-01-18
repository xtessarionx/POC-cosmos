package com.hehe.demohehe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorpCodeinMerge {
    @Id
    private String id;
    private String name;
    private String status;
}
