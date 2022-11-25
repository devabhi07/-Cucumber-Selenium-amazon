package com.cucumber_demo.Amazon;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\abhis\\Downloads\\Amazon\\Features", glue={"com.cucumber_demo.Amazon"} , publish=true)
public class Runner {

}
