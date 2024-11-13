package com.project.RabbitRun.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Represents an entity within the game, including attributes for
 * position, speed, directional images, and collision handling.
 */
public class Entity {

    /** X-coordinate of the entity's position in the game world. */
    protected int worldX;

    /** Y-coordinate of the entity's position in the game world. */
    protected int worldY;

    /** Speed at which the entity moves. */
    protected int speed;

    /** Image for moving up (first frame). */
    public BufferedImage up1;

    /** Image for moving down (first frame). */
    public BufferedImage down1;

    /** Image for moving left (first frame). */
    protected BufferedImage left1;

    /** Image for moving right (first frame). */
    protected BufferedImage right1;

    /** Image for moving up (second frame). */
    protected BufferedImage up2;

    /** Image for moving down (second frame). */
    protected BufferedImage down2;

    /** Image for moving left (second frame). */
    protected BufferedImage left2;

    /** Image for moving right (second frame). */
    protected BufferedImage right2;

    /** Current direction the entity is facing, such as "up", "down", "left", or "right". */
    protected String direction;

    /** Counter for managing sprint animations. */
    protected int sprintCounter = 0;

    /** Current frame of the sprite animation (either 1 or 2). */
    protected int spriteNumber = 1;

    /** Rectangle representing the solid area for collision detection. */
    public Rectangle solidArea;

    /** Default X-coordinate of the solid area's position. */
    protected int solidAreaDefaultX;

    /** Default Y-coordinate of the solid area's position. */
    protected int solidAreaDefaultY;

    /** Indicates whether a collision is currently occurring. */
    protected boolean collisionOn = false;

    public int getWorldX() {
        return worldX;
    }

    public void setWorldX(int worldX) {
        this.worldX = worldX;
    }

    public int getWorldY() {
        return worldY;
    }

    public void setWorldY(int worldY) {
        this.worldY = worldY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Rectangle getSolidArea() {
        return solidArea;
    }

    public void setSolidArea(Rectangle solidArea) {
        this.solidArea = solidArea;
    }

    public int getSolidAreaDefaultX() {
        return solidAreaDefaultX;
    }

    public void setSolidAreaDefaultX(int solidAreaDefaultX) {
        this.solidAreaDefaultX = solidAreaDefaultX;
    }

    public int getSolidAreaDefaultY() {
        return solidAreaDefaultY;
    }

    public void setSolidAreaDefaultY(int solidAreaDefaultY) {
        this.solidAreaDefaultY = solidAreaDefaultY;
    }

    public boolean isCollisionOn() {
        return collisionOn;
    }

    public void setCollisionOn(boolean collisionOn) {
        this.collisionOn = collisionOn;
    }
}
