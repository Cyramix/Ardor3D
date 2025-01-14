/**
 * Copyright (c) 2008-2021 Bird Dog Games, Inc.
 *
 * This file is part of Ardor3D.
 *
 * Ardor3D is free software: you can redistribute it and/or modify it
 * under the terms of its license which may be found in the accompanying
 * LICENSE file or at <http://www.ardor3d.com/LICENSE>.
 */

package com.ardor3d.extension.terrain.client;

import java.util.List;

import com.ardor3d.extension.terrain.util.Region;
import com.ardor3d.math.type.ReadOnlyTransform;

public interface IRegionUpdateListener {
  void onRegionsUpdated(List<Region> regions, ReadOnlyTransform worldTransform);
}
