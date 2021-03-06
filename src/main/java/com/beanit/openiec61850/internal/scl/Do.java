/*
 * Copyright 2011 The OpenIEC61850 Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.beanit.openiec61850.internal.scl;

import com.beanit.openiec61850.SclParseException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public final class Do extends AbstractElement {

  private String type;

  public Do(String name, String desc, String type) {
    super(name, desc);
  }

  public Do(Node xmlNode) throws SclParseException {
    super(xmlNode);

    NamedNodeMap attributes = xmlNode.getAttributes();

    Node node = attributes.getNamedItem("type");

    if (node == null) {
      throw new SclParseException("Required attribute \"type\" not found!");
    }

    type = node.getNodeValue();
  }

  public String getType() {
    return type;
  }
}
