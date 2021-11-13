package com.company.domain.entity;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;

import lombok.Data;

@Data 
public class TestScenario implements Serializable {
	private static final long serialVersionUID = -7097797302762617108L;
	private ObjectId _id;
	private String environment;
    private String component;
    private String scenarioName;
    private String scenarioDesc;
    private String scenarioStatus;
    private List<String> group;
    private String testClass;
    private String testMethod;
    private ObjectId parentScenarioId;
    private List<ObjectId> testAgents;
}
