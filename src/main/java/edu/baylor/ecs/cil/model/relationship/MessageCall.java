package edu.baylor.ecs.cil.model.relationship;

import edu.baylor.ecs.cil.model.nodes.MetaMethod;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "CALLEDTO")
public class MessageCall {

    @StartNode private MetaMethod start;

    @EndNode private MetaMethod end;

    private String ip;

    private int port;


}
