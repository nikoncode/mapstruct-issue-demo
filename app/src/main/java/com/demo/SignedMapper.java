package com.demo;

import com.demo.v1.Item2;
import com.demo.v1.Signed;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface SignedMapper {
    @Mapping(target = "data.item2.id", source = "id")
    @Mapping(target = "data.items", source = "signed")
    Signed toSigned(String id, List<Data> signed);

    @Mapping(target = "data.item2", source = "id")
    @Mapping(target = "data.items", source = "signed")
    Signed toSigned2(String id, List<Data> signed);

    default Item2 map(String id) {
        return Item2.newBuilder().setId(id).build();
    }

    @Mapping(target = "data.item2.id", source = "id")
    Signed toSignedNotFail(String id, List<Data> signed);

    @Mapping(target = "data.items", source = "signed")
    Signed toSignedNotFail2(String id, List<Data> signed);

    @Mapping(target = "data.item2", source = "id")
    Signed toSignedNotFail3(String id, List<Data> signed);
}
