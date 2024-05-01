package com.example.demo

import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses

@AnalyzeClasses(packages = ["com.example.demo"])
class ProjectStructureTest {
    @ArchTest
    val `controller는 adapter-in package에 위치해야한다` =
        classes().that().areAnnotatedWith("org.springframework.web.bind.annotation.RestController")
            .should().resideInAPackage("..adapter.in..")

    @ArchTest
    val `incoming adapter가 붙은 클래스들은 adapter-in package에 위치해야한다` =
        classes().that().areAnnotatedWith("com.example.demo.annotation.IncomingAdapter")
            .should().resideInAPackage("..adapter.in..")

    @ArchTest
    val `repository 들은 repository 패키지에 위치해야한다` =
        classes().that().areAnnotatedWith("org.springframework.stereotype.Repository")
            .should().resideInAPackage("..repository..")

    @ArchTest
    val `outgoing adapter가 붙은 클래스들은 adapter-out package에 위치해야한다` =
        classes().that().areAnnotatedWith("com.example.demo.annotation.OutgoingAdapter")
            .should().resideInAPackage("..adapter.out..")

    @ArchTest
    val `incoming adapter들은 output port를 사용해선 안된다` =
        noClasses().that().resideInAPackage("..adapter.in..")
            .should().dependOnClassesThat().resideInAPackage("..port.out..")

    @ArchTest
    val `incoming adapter들은 repository를 직접 사용해선 안된다` =
        noClasses().that().resideInAPackage("..adapter.in..")
            .should().dependOnClassesThat().resideInAPackage("..repository..")

    @ArchTest
    val `controller는 repository를 직접 사용해선 안된다` =
        noClasses().that().areAnnotatedWith("org.springframework.web.bind.annotation.RestController")
            .or().areAnnotatedWith("org.springframework.web.bind.annotation.Controller")
            .should().dependOnClassesThat().resideInAPackage("..repository..")
            .andShould().dependOnClassesThat().areAnnotatedWith("org.springframework.stereotype.Repository")
            .andShould().dependOnClassesThat().areAnnotatedWith("com.example.demo.annotation.OutgoingAdapter")
}
