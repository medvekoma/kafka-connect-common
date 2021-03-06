/*
 *  Copyright 2017 Datamountaineer.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.datamountaineer.streamreactor.connect.utils

import com.jcabi.manifests.Manifests

/**
  * Created by andrew@datamountaineer.com on 31/10/2017. 
  * kafka-connect-common
  */
object ReadManifest {
  def mainfest(): String =
    s"""
       |StreamReactor-Version:  ${Manifests.read("StreamReactor-Version")}
       |Kafka-Version:          ${Manifests.read("Kafka-Version")}
       |KCQL-Version:           ${Manifests.read("KCQL-Version")}
       |Git-Repo:               ${Manifests.read("Git-Repo")}
       |Git-Commit-Hash:        ${Manifests.read("Git-Commit-Hash")}
       |Git-Tag:                ${Manifests.read("Git-Tag")}
       |StreamReactor-Docs:     ${Manifests.read("StreamReactor-Docs")}
    """.stripMargin
}
