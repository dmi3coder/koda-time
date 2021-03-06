/*
 * Copyright (c) 2016. Sunghyouk Bae <sunghyouk.bae@gmail.com>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.github.debop.kodatimes

import org.junit.Test
import org.slf4j.LoggerFactory

// kobalt test 에서 abstract class에 대해서도 test 를 만들려고 한다  
open class AbstractKodaTimesTest {

  protected val log by lazy { LoggerFactory.getLogger(this::class.java) }

  @Test fun dummy() {
    println("Dummy test function")
  }
}