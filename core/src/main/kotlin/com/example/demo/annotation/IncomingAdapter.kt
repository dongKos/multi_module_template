package com.example.demo.annotation

/*
* 외부에서 들어오는 요청을 처리하는 어댑터임을 명시하는 어노테이션
* RestController, KafkaListener 등이 있음.
* */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class IncomingAdapter
