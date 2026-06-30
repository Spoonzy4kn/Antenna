# Accessibility Requirements

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This document defines accessibility requirements for Antenna's Android implementation.

Accessibility is part of application quality. Antenna should be readable, navigable, predictable, and compatible with Android accessibility services where practical.

---

## 2. Accessibility goals

Antenna should support:

- Clear reading of posts and comments.
- Predictable navigation.
- Screen reader labelling.
- Dynamic text sizing.
- Sufficient contrast in light and dark modes.
- Touch targets that are practical to use.
- Non-colour-only status indicators.
- Accessible loading, empty, error, restricted, and unsupported states.

---

## 3. Requirements

| ID | Requirement |
| --- | --- |
| AX-001 | Primary navigation items shall have clear accessible labels. |
| AX-002 | Interactive controls should expose state where relevant. |
| AX-003 | Post and comment text should support dynamic font size where practical. |
| AX-004 | Colour shall not be the only way to communicate selection, NSFW status, error state, or restricted content. |
| AX-005 | Important touch targets should be large enough for reliable interaction. |
| AX-006 | Comment collapse/expand controls shall communicate expanded/collapsed state. |
| AX-007 | Error and empty states shall contain text explanations, not only icons. |
| AX-008 | Settings toggles shall have clear labels and descriptions. |
| AX-009 | NSFW visibility controls shall be clear and not ambiguous. |
| AX-010 | Light and dark modes should both be manually checked for readability. |

---

## 4. Screen reader expectations

Screen reader users should be able to understand:

- Which primary navigation section is selected.
- What each post preview represents.
- Whether a post is NSFW where visible.
- Whether a comment thread is expanded or collapsed.
- Whether content failed to load and what action is available.
- What a settings toggle controls.

---

## 5. Dynamic text

The UI should remain usable when the user increases system font size.

Priority screens for dynamic text checks:

- Home feed.
- Community feed.
- Post detail.
- Comments.
- My Subs.
- Settings.
- Error and empty states.

---

## 6. Contrast and visual state

The design should be readable in light and dark modes.

States that need clear visual and textual support:

- Selected navigation item.
- Loading.
- Error.
- Offline.
- Restricted.
- Unsupported.
- Account required.
- NSFW indicator.

---

## 7. Manual accessibility checklist

Before release:

- [ ] Navigate all primary tabs with TalkBack.
- [ ] Add and remove a local favourite with TalkBack.
- [ ] Open a post and read comments with TalkBack.
- [ ] Collapse and expand comments with TalkBack.
- [ ] Increase system font size and review main screens.
- [ ] Review light mode contrast.
- [ ] Review dark mode contrast.
- [ ] Confirm error states contain meaningful text.
- [ ] Confirm NSFW setting flow is understandable.

---

## 8. Summary

Antenna should be accessible by design rather than as a late polish step. Accessibility requirements should be considered during component design, not only during final testing.
