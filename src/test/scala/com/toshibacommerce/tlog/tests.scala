
package com.toshibacommerce.tlog

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object Tests {
  lazy val runner = Runner("com/toshibacommerce/tlog", "tests.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class Tests {
  import Tests._

  @Test def testACE1() { runner.runOneTest("testACE1") }
  @Test def testACE2() { runner.runOneTest("testACE2") }
  @Test def testACE3() { runner.runOneTest("testACE3") }
  @Test def testACE4() { runner.runOneTest("testACE4") }

  @Test def testSA1() { runner.runOneTest("testSA1") }
  @Test def testTR07_01() { runner.runOneTest("testTR07_01") }

}
