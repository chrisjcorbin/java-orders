package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Agent;

public interface AgentServices {
    Agent save(Agent agent);

    Agent findAgentById(long agentId);

    void delete(long agentcode);
}
