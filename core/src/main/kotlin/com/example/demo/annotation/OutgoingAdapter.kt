package com.example.demo.annotation

/*
* 외부로 나가는 요청을 처리하는 어댑터임을 명시하는 어노테이션
* Repository, KafkaProducer, HttpClient 등이 있음.
* */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class OutgoingAdapter
