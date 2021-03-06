/*
Copyright 2011-2016 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.MainWindow.ProjectTree.Actions;

import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.google.security.zynamics.binnavi.Gui.MainWindow.Implementations.CViewFunctions;
import com.google.security.zynamics.binnavi.disassembly.views.INaviView;


/**
 * Action class used for unstar-ing views.
 */
public class CUnstarViewAction extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = -1783264696418365276L;

  /**
   * Parent window used for dialogs.
   */
  private final Window m_parent;

  /**
   * The views which are unstared.
   */
  private final INaviView[] m_views;

  /**
   * Creates a new action object.
   * 
   * @param parent Parent window used for dialogs.
   * @param views The views which are unstared.
   */
  public CUnstarViewAction(final Window parent, final INaviView[] views) {
    super("Unstar view");

    m_parent = parent;
    m_views = views.clone();
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    CViewFunctions.unstar(m_parent, m_views);
  }
}
