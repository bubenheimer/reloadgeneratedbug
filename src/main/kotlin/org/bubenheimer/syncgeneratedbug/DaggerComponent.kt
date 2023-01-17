package org.bubenheimer.syncgeneratedbug

import dagger.Component

@Component
interface EmptyComponent

val component: EmptyComponent = DaggerEmptyComponent.builder()
        .build()
