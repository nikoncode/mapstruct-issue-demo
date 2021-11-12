/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.demo;

import org.mapstruct.factory.Mappers;

import static java.util.Collections.singletonList;

public class App {
    public static void main(String[] args) {
        SignedMapper mapper = Mappers.getMapper(SignedMapper.class);

        System.out.println(mapper.toSignedNotFail("test", singletonList(new Data("a", "b"))));
        System.out.println(mapper.toSignedNotFail2("test", singletonList(new Data("a", "b"))));
        System.out.println(mapper.toSignedNotFail3("test", singletonList(new Data("a", "b"))));

    }
}