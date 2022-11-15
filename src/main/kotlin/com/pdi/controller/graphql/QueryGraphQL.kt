package com.pdi.controller.graphql

import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QueryGraphQL(): GraphQLQueryResolver {

    fun hello() = "Hello World"
}