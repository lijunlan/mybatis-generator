#! /bin/bash

base_dir=$(dirname $0)

rm -rf $base_dir/../mybatis-generater/src/main/java/*

cd $base_dir/../mybatis-generater

mvn clean mybatis-generator:generate

echo '[INFO]POJO AND MAPPING GENERATED SUCCESSFULLY'
