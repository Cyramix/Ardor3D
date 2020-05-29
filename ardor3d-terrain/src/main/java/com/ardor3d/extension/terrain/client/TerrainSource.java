
package com.ardor3d.extension.terrain.client;

import java.util.Set;

import com.ardor3d.extension.terrain.util.Tile;

/**
 * Feeds terrain data to a TerrainCache
 */
public interface TerrainSource {
    /**
     * Called to initialize and setup the geometry clipmap terrain.
     *
     * @return TerrainConfiguration
     * @throws Exception
     */
    TerrainConfiguration getConfiguration() throws Exception;

    /**
     * Returns which tiles that contain data in the requested region.
     *
     * @param clipmapLevel
     * @param tileX
     * @param tileY
     * @param numTilesX
     * @param numTilesY
     * @return
     * @throws Exception
     */
    Set<Tile> getValidTiles(final int clipmapLevel, final int tileX, final int tileY, int numTilesX, int numTilesY)
            throws Exception;

    /**
     * Returns which tiles that should be marked as invalid and updated in the requested region.
     *
     * @param clipmapLevel
     * @param tileX
     * @param tileY
     * @param numTilesX
     * @param numTilesY
     * @return
     * @throws Exception
     */
    Set<Tile> getInvalidTiles(final int clipmapLevel, final int tileX, final int tileY, int numTilesX, int numTilesY)
            throws Exception;

    /**
     * Request for height data for a tile.
     *
     * @param clipmapLevel
     * @param tile
     * @return
     * @throws Exception
     */
    float[] getTile(int clipmapLevel, final Tile tile) throws Exception;
}
