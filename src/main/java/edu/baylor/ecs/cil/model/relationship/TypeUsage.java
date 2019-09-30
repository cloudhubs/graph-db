package edu.baylor.ecs.cil.model.relationship;

import edu.baylor.ecs.cil.model.enums.TypeUsageEnum;
import edu.baylor.ecs.cil.model.nodes.MetaMethod;
import edu.baylor.ecs.cil.model.nodes.MetaType;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
//Import org.neo4j.ogm.annotation.typeconversion.EnumString;

@RelationshipEntity
public class TypeUsage {

    @StartNode private MetaMethod metaMethod;
    @EndNode private MetaType metaType;
    
    //@EnumString()
    private TypeUsageEnum typeUsageEnum;

    

}
